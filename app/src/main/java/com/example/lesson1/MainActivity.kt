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
                Toast.makeText(this,"yek-i dü",Toast.LENGTH_SHORT).show()
            else if(rastgele == 3 && rastgele2 == 3)
                Toast.makeText(this,"Dü Se",Toast.LENGTH_SHORT).show()
            else if((rastgele == 3 && rastgele2 == 2) || (rastgele == 2 && rastgele2 == 3))
                Toast.makeText(this,"Seba-i Dü",Toast.LENGTH_SHORT).show()
            else if((rastgele == 3 && rastgele2 == 1) || (rastgele == 1 && rastgele2 == 3))
                Toast.makeText(this,"Se Yek",Toast.LENGTH_SHORT).show()
            else if(rastgele == 4 && rastgele2 == 4)
                Toast.makeText(this,"Dört Cihar",Toast.LENGTH_SHORT).show()
            else if((rastgele == 4 && rastgele2 == 3) || (rastgele == 3 && rastgele2 == 4))
                Toast.makeText(this,"Cihar-ü Se",Toast.LENGTH_SHORT).show()
            else if((rastgele == 4 && rastgele2 == 2) || (rastgele == 2 && rastgele2 == 4))
                Toast.makeText(this,"Cihar-i Dü",Toast.LENGTH_SHORT).show()
            else if((rastgele == 4 && rastgele2 == 1) || (rastgele == 1 && rastgele2 == 4))
                Toast.makeText(this,"Cihar-ı Yek",Toast.LENGTH_SHORT).show()
            else if(rastgele == 5 && rastgele2 == 5)
                Toast.makeText(this,"Dü Beş",Toast.LENGTH_SHORT).show()
            else if((rastgele == 5 && rastgele2 == 4) || (rastgele == 4 && rastgele2 == 5))
                Toast.makeText(this,"Cihar-ü Penc",Toast.LENGTH_SHORT).show()
            else if((rastgele == 5 && rastgele2 == 3) || (rastgele == 3 && rastgele2 == 5))
                Toast.makeText(this,"Penc-ü Se",Toast.LENGTH_SHORT).show()
            else if((rastgele == 5 && rastgele2 == 2) || (rastgele == 2 && rastgele2 == 5))
                Toast.makeText(this,"Penc-i Dü",Toast.LENGTH_SHORT).show()
            else if((rastgele == 5 && rastgele2 == 1) || (rastgele == 1 && rastgele2 == 5))
                Toast.makeText(this,"Penc-i Yek",Toast.LENGTH_SHORT).show()
            else if(rastgele == 6 && rastgele2 == 6)
                Toast.makeText(this,"Dü Şeş",Toast.LENGTH_SHORT).show()
            else if((rastgele == 6 && rastgele2 == 5) || (rastgele == 5 && rastgele2 == 6))
                Toast.makeText(this,"Şeş Beş",Toast.LENGTH_SHORT).show()
            else if((rastgele == 6 && rastgele2 == 4) || (rastgele == 4 && rastgele2 == 6))
                Toast.makeText(this,"Şeş Cihar",Toast.LENGTH_SHORT).show()
            else if((rastgele == 6 && rastgele2 == 3) || (rastgele == 3 && rastgele2 == 6))
                Toast.makeText(this,"Şeş-ü Se",Toast.LENGTH_SHORT).show()
            else if((rastgele == 6 && rastgele2 == 2) || (rastgele == 2 && rastgele2 == 6))
                Toast.makeText(this,"Şeş-i Dü",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"Şeş-i Yek",Toast.LENGTH_SHORT).show()

        }
    }
}