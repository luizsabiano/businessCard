package br.com.luizsabiano.businesscard

import android.app.Application
import br.com.luizsabiano.businesscard.data.AppDatabase
import br.com.luizsabiano.businesscard.data.BusinessCardRepository

class App : Application () {

    val database by lazy { AppDatabase.getDatabase(this)}
    val repository by lazy {BusinessCardRepository(database.businessDao())}
}