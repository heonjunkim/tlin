package com.biz.imgrister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private val petList = arrayListOf<PetVO>(
            PetVO("팬더",10,"male","pet1"),
            PetVO("여우",5,"female","pet2"),
            PetVO("파이리",3,"male","pet3"),
            PetVO("꼬부기",2,"female","pet4"),
            PetVO("이상해씨",1,"female","pet5"),




    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val petListView = findViewById<RecyclerView>(R.id.pet_list)
        petListView.layoutManager = LinearLayoutManager(this)
        petListView.setHasFixedSize(true)
        petListView.adapter = PetViewAdapter(petList,this)
    }
}