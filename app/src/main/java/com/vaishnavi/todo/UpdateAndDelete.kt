package com.vaishnavi.todo

interface UpdateAndDelete{
    fun modifyItem(itemUID :String, isDone :Boolean)
    fun onItemDelete(itemUID :String)
}