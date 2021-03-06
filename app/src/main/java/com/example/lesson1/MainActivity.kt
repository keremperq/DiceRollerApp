package com.example.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var baslaTusu : Button = findViewById(R.id.baslangic)
        var zarGoster: ImageView = findViewById(R.id.imageView5)
        var zarGoster2: ImageView = findViewById(R.id.imageView6)

        zarGoster.setImageResource(R.drawable.dice_1)
        zarGoster2.setImageResource(R.drawable.dice_1)

        baslaTusu.setOnClickListener {
            var rastgele = (1..6).random()
            var rastgele2 = (1..6).random()


            when(rastgele){
                1 -> zarGoster.setImageResource(R.drawable.dice_1)
                2 -> zarGoster.setImageResource(R.drawable.dice_2)
                3 -> zarGoster.setImageResource(R.drawable.dice_3)
                4 -> zarGoster.setImageResource(R.drawable.dice_4)
                5 -> zarGoster.setImageResource(R.drawable.dice_5)
                6 -> zarGoster.setImageResource(R.drawable.dice_6)
            }

            when(rastgele2){
                1 -> zarGoster2.setImageResource(R.drawable.dice_1)
                2 -> zarGoster2.setImageResource(R.drawable.dice_2)
                3 -> zarGoster2.setImageResource(R.drawable.dice_3)
                4 -> zarGoster2.setImageResource(R.drawable.dice_4)
                5 -> zarGoster2.setImageResource(R.drawable.dice_5)
                6 -> zarGoster2.setImageResource(R.drawable.dice_6)
            }

            if(rastgele == 1 && rastgele2 == 1)
                Toast.makeText(this,"Hep Yek",Toast.LENGTH_SHORT).show()
            else if(rastgele == 2 && rastgele2 == 2)
                Toast.makeText(this,"Dubara",Toast.LENGTH_SHORT).show()
            else if((rastgele == 2 && rastgele2 == 1) || (rastgele == 1 && rastgele2 == 2))
                Toast.makeText(this,"yek-i d??",Toast.LENGTH_SHORT).show()
            else if(rastgele == 3 && rastgele2 == 3)
                Toast.makeText(this,"D?? Se",Toast.LENGTH_SHORT).show()
            else if((rastgele == 3 && rastgele2 == 2) || (rastgele == 2 && rastgele2 == 3))
                Toast.makeText(this,"Seba-i D??",Toast.LENGTH_SHORT).show()
            else if((rastgele == 3 && rastgele2 == 1) || (rastgele == 1 && rastgele2 == 3))
                Toast.makeText(this,"Se Yek",Toast.LENGTH_SHORT).show()
            else if(rastgele == 4 && rastgele2 == 4)
                Toast.makeText(this,"D??rt Cihar",Toast.LENGTH_SHORT).show()
            else if((rastgele == 4 && rastgele2 == 3) || (rastgele == 3 && rastgele2 == 4))
                Toast.makeText(this,"Cihar-?? Se",Toast.LENGTH_SHORT).show()
            else if((rastgele == 4 && rastgele2 == 2) || (rastgele == 2 && rastgele2 == 4))
                Toast.makeText(this,"Cihar-i D??",Toast.LENGTH_SHORT).show()
            else if((rastgele == 4 && rastgele2 == 1) || (rastgele == 1 && rastgele2 == 4))
                Toast.makeText(this,"Cihar-?? Yek",Toast.LENGTH_SHORT).show()
            else if(rastgele == 5 && rastgele2 == 5)
                Toast.makeText(this,"D?? Be??",Toast.LENGTH_SHORT).show()
            else if((rastgele == 5 && rastgele2 == 4) || (rastgele == 4 && rastgele2 == 5))
                Toast.makeText(this,"Cihar-?? Penc",Toast.LENGTH_SHORT).show()
            else if((rastgele == 5 && rastgele2 == 3) || (rastgele == 3 && rastgele2 == 5))
                Toast.makeText(this,"Penc-?? Se",Toast.LENGTH_SHORT).show()
            else if((rastgele == 5 && rastgele2 == 2) || (rastgele == 2 && rastgele2 == 5))
                Toast.makeText(this,"Penc-i D??",Toast.LENGTH_SHORT).show()
            else if((rastgele == 5 && rastgele2 == 1) || (rastgele == 1 && rastgele2 == 5))
                Toast.makeText(this,"Penc-i Yek",Toast.LENGTH_SHORT).show()
            else if(rastgele == 6 && rastgele2 == 6)
                Toast.makeText(this,"D?? ??e??",Toast.LENGTH_SHORT).show()
            else if((rastgele == 6 && rastgele2 == 5) || (rastgele == 5 && rastgele2 == 6))
                Toast.makeText(this,"??e?? Be??",Toast.LENGTH_SHORT).show()
            else if((rastgele == 6 && rastgele2 == 4) || (rastgele == 4 && rastgele2 == 6))
                Toast.makeText(this,"??e?? Cihar",Toast.LENGTH_SHORT).show()
            else if((rastgele == 6 && rastgele2 == 3) || (rastgele == 3 && rastgele2 == 6))
                Toast.makeText(this,"??e??-?? Se",Toast.LENGTH_SHORT).show()
            else if((rastgele == 6 && rastgele2 == 2) || (rastgele == 2 && rastgele2 == 6))
                Toast.makeText(this,"??e??-i D??",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"??e??-i Yek",Toast.LENGTH_SHORT).show()

        }
    }
}