package com.example.common

interface Mapper<T : Any?, R> {

    fun map(param: T): R
}
