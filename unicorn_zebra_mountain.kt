package com.holisticcenter //Package declaration

import kotlin.math.min //Importing the min function from the kotlin.math library

//Class definition
class HolisticHealingAndWellnessCenter {
    //data members
    var name : String ?= null
    var address : String ?= null
    var services : Array<String> ?= null

    //constructor
    constructor(name : String, address : String, services : Array<String>) {
        this.name = name
        this.address = address
        this.services = services
    }
    //method to get the list of services
    fun getServices(): Array<String>? {
        return this.services
    }
    //method to get the name of the center
    fun getName(): String? {
        return this.name
    }
    //method to get the address of the center
    fun getAddress(): String? {
        return this.address
    }
    //method to get the size of the services offered
    fun getNumberOfServices(): Int {
        return this.services!!.size
    }
    //method to get the smallest service among the services offered
    fun getSmallestService(): String? {
        var smallestService : String? = null
        var min = Int.MAX_VALUE
        for (i in 0 until this.getNumberOfServices()) {
            if (min > this.services!![i].length) {
                min = this.services!![i].length
                smallestService = this.services!![i]
            }
        }
        return smallestService
    }
    //method to add the services in the center
    fun addService(service : String) {
        var newServices = this.services
        newServices!!.plus(service)
        this.services = newServices
    }
    //method to check if the center offers a particular service
    fun checkService(serviceName : String) : Boolean {
        for (i in 0 until this.getNumberOfServices()) {
            if(this.services!![i].equals(serviceName))
                return true
        }
        return false
    }
    //overriding the toString method to display details about center
    override fun toString(): String {
        return "Holistic Healing and Wellness Center : " +
                "Name : " + this.name +
                ", Address : " + this.address 
    }
}

// To create a test instance of HolisticHealingAndWellnessCenter
fun main(args:Array<String>){
    var services : Array<String> = arrayOf("massage", "counselling", "meditation", "yoga")
    var centerInstance = HolisticHealingAndWellnessCenter("Holistic Healing and Wellness Center", "New York", services)
    //Checking if the center offers a particular service
    println(centerInstance.checkService("massage"))
}