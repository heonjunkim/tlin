package com.biz.hello.adaper

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.biz.hello.db.MemoRepository
import com.biz.hello.model.MemoVO

class MemoViewModel (app: Application) : AndroidViewModel(app) {

    private val memoRepo : MemoRepository = MemoRepository(app)
    private lateinit var memoList : LiveData<MutableList<MemoVO>>

    init {
        memoList = memoRepo.selectAll()
    }


    fun selectAll() : LiveData<MutableList<MemoVO>> {
        return memoList
    }

    fun insert(memoVO: MemoVO) {
        memoRepo.insert(memoVO)
    }

}