package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("ThrowableNotThrown","KotlinConstantConditions")
class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var result:StringBuilder
    lateinit var txt:TextView
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)){ v: View, insets: WindowInsetsCompat ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        result =StringBuilder()

        val but_0:TextView   =findViewById(R.id.but_0)
        val but_1:TextView   =findViewById(R.id.but_1)
        val but_2:TextView   =findViewById(R.id.but_2)
        val but_3:TextView   =findViewById(R.id.but_3)
        val but_4:TextView   =findViewById(R.id.but_4)
        val but_5:TextView   =findViewById(R.id.but_5)
        val but_6:TextView   =findViewById(R.id.but_6)
        val but_7:TextView   =findViewById(R.id.but_7)
        val but_8:TextView   =findViewById(R.id.but_8)
        val but_9:TextView   =findViewById(R.id.but_9)
        val but_plus:TextView   =findViewById(R.id.but_plus)
        val but_minus:TextView   =findViewById(R.id.but_minus)
        val but_multi:TextView   =findViewById(R.id.but_multi)
        val but_divide:TextView   =findViewById(R.id.but_divide)
         txt =findViewById(R.id.numbers)


        but_0.setOnClickListener(this)
        but_1.setOnClickListener(this)
        but_2.setOnClickListener(this)
        but_3.setOnClickListener(this)
        but_4.setOnClickListener(this)
        but_5.setOnClickListener(this)
        but_6.setOnClickListener(this)
        but_7.setOnClickListener(this)
        but_8.setOnClickListener(this)
        but_9.setOnClickListener(this)
        but_plus.setOnClickListener(this)
        but_minus.setOnClickListener(this)
        but_multi.setOnClickListener(this)
        but_divide.setOnClickListener(this)







//        val e1:EditText =findViewById(R.id.editTextNumber)
//        val op:EditText =findViewById(R.id.editTextNumber2)
//        val e2:EditText =findViewById(R.id.editTextNumber3)
//        val re:TextView =findViewById(R.id.textView)
//        val bu:Button   =findViewById(R.id.button)

//        bu.setOnClickListener{
//
//            if (op.text.isEmpty() ||e1.text.isEmpty() || e2.text.isEmpty() ) {
//                re.text ="Infinity"
//                return@setOnClickListener
//            }
//
//            val c:Char =op.text.single()
//            val x:Double = e1.text.toString().toDouble()
//            val y:Double = e2.text.toString().toDouble()
//            val operation = Example()
//            operation.notification(context = applicationContext,MainActivity::class.java)
//
//            val result = when(c){
//
//                '*'->operation.multi(x = x, y = y)
//                '+'->operation.sum(x = x, y = y)
//                '-'->operation.sub(x = x, y = y)
//                '/'->operation.divide(x = x, y = y)
//                else->Exception("this operation not found")
//            }
//            re.text =result.toString()
//        }


    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.but_0 ->result.append("0")
            R.id.but_1 ->result.append("1")
            R.id.but_2 ->result.append("2")
            R.id.but_3 ->result.append("3")
            R.id.but_4 ->result.append("4")
            R.id.but_5 ->result.append("5")
            R.id.but_6 ->result.append("6")
            R.id.but_7 ->result.append("7")
            R.id.but_8 ->result.append("8")
            R.id.but_9 ->result.append("9")
            R.id.but_plus  ->result.append("+")
            R.id.but_minus ->result.append("-")
            R.id.but_multi ->result.append("*")
            R.id.but_divide->result.append("/")


        }
        var b =0.0
        for (item in result) {
            b += item.toString().toDouble()
        }

        txt.text="$b"

    }


}