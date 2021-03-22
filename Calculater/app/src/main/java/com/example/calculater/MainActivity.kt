package com.example.calculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nine.setOnClickListener {
//            var str = show.text.toString()!!.toInt()
            if (show.text.toString() == "0") {
                show.setText("9")
            } else {
                var str = show.text.toString().plus(other = 9)

                show.setText(str)
            }
            }
            eight.setOnClickListener {
//            var str = show.text.toString()!!.toInt()
                if (show.text.toString() == "0") {
                    show.setText("8")
                } else {
                    var str = show.text.toString().plus(other = 8)

                    show.setText(str)
                }
            }
            seven.setOnClickListener {
//            var str = show.text.toString()!!.toInt()
                if (show.text.toString() == "0") {
                    show.setText("7")
                } else {
                    var str = show.text.toString().plus(other = 7)

                    show.setText(str)
                }
            }
        six.setOnClickListener {
//            var str = show.text.toString()!!.toInt()
            if (show.text.toString() == "0") {
                show.setText("6")
            } else {
                var str = show.text.toString().plus(other = 6)

                show.setText(str)
            }
        }
        five.setOnClickListener {
//            var str = show.text.toString()!!.toInt()
            if (show.text.toString() == "0") {
                show.setText("5")
            } else {
                var str = show.text.toString().plus(other = 5)

                show.setText(str)
            }
        }
        four.setOnClickListener {
//            var str = show.text.toString()!!.toInt()
            if (show.text.toString() == "0") {
                show.setText("4")
            } else {
                var str = show.text.toString().plus(other = 4)

                show.setText(str)
            }
        }
        three.setOnClickListener {
//            var str = show.text.toString()!!.toInt()
            if (show.text.toString() == "0") {
                show.setText("3")
            } else {
                var str = show.text.toString().plus(other = 3)

                show.setText(str)
            }
        }
        two.setOnClickListener {
//            var str = show.text.toString()!!.toInt()
            if (show.text.toString() == "0") {
                show.setText("2")
            } else {
                var str = show.text.toString().plus(other = 2)

                show.setText(str)
            }
        }
        one.setOnClickListener {
//            var str = show.text.toString()!!.toInt()
            if (show.text.toString() == "0") {
                show.setText("1")
            } else {
                var str = show.text.toString().plus(other = 1)

                show.setText(str)
            }
        }

            c.setOnClickListener {
                show.setText("0")

            }
            del.setOnClickListener {
            if(show.text.toString().length<=1){
                show.setText("0")
            }
                else{
                    show.text = show.text.dropLast(1)
                }

        }

        }
    }