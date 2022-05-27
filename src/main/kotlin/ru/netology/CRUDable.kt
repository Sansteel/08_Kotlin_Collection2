package ru.netology

interface CRUDable {
    //val ID: Int

    fun create(obj: Any, dataSet:  ) : Any {
        obj = obj.add()
        println("Объект создан")
        return obj
    }
    fun read() {
            println("Объект прочитан")
    }
    fun update() {
        println("Объект обновлен")
    }
    fun delete() {
        println("Объект удален")
    }
}