package com.example.hw8_maktab67_part2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var a: Button
    private lateinit var b: Button
    private lateinit var c: Button
    private lateinit var d: Button
    private lateinit var e: Button
    private lateinit var f: Button
    private lateinit var g: Button
    private lateinit var h: Button
    private lateinit var i: Button
    private lateinit var playerOne: TextView
    private lateinit var playerTwo: TextView

    private var playerOneMain = mutableListOf<Char>()
    private var playerTwoMain = mutableListOf<Char>()
    private var turnMain = true
    private var scoreOneMain = 0
    private var scoreTwoMain = 0
    private var playerWinMain = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        a = findViewById(R.id.a)
        b = findViewById(R.id.b)
        c = findViewById(R.id.c)
        d = findViewById(R.id.d)
        e = findViewById(R.id.e)
        f = findViewById(R.id.f)
        g = findViewById(R.id.g)
        h = findViewById(R.id.h)
        i = findViewById(R.id.i)
        playerOne = findViewById(R.id.playerOne)
        playerTwo = findViewById(R.id.playerTwo)

        a.setOnClickListener (this)
        b.setOnClickListener(this)
        c.setOnClickListener(this)
        d.setOnClickListener(this)
        e.setOnClickListener(this)
        f.setOnClickListener(this)
        g.setOnClickListener(this)
        h.setOnClickListener(this)
        i.setOnClickListener(this)

        playerOne.text = getString(R.string.playerOneZero)
        playerTwo.text = getString(R.string.playerTwoZero)
    }

    override fun onClick(p0: View?) {

        if (p0 != null) {
            when (p0.id) {

                R.id.a -> {
                    if (turnMain) {
                        playerOneMain.add('a')
                        a.text = "X"
                    } else {
                        playerTwoMain.add('a')
                        a.text ="O"
                    }
                    a.isClickable = false
                }

                R.id.b -> {
                    if (turnMain) {
                        playerOneMain.add('b')
                        b.text = "X"
                    } else {
                        playerTwoMain.add('b')
                        b.text ="O"
                    }
                    b.isClickable = false
                }

                R.id.c -> {
                    if (turnMain) {
                        playerOneMain.add('c')
                        c.text = "X"
                    } else {
                        playerTwoMain.add('c')
                        c.text ="O"
                    }
                    c.isClickable = false
                }

                R.id.d -> {
                    if (turnMain) {
                        playerOneMain.add('d')
                        d.text = "X"
                    } else {
                        playerTwoMain.add('d')
                        d.text ="O"
                    }
                    d.isClickable = false
                }

                R.id.e -> {
                    if (turnMain) {
                        playerOneMain.add('e')
                        e.text = "X"
                    } else {
                        playerTwoMain.add('e')
                        e.text ="O"
                    }
                    e.isClickable = false
                }

                R.id.f -> {
                    if (turnMain) {
                        playerOneMain.add('f')
                        f.text = "X"
                    } else {
                        playerTwoMain.add('f')
                        f.text ="O"
                    }
                    f.isClickable = false
                }

                R.id.g -> {
                    if (turnMain) {
                        playerOneMain.add('g')
                        g.text = "X"
                    } else {
                        playerTwoMain.add('g')
                        g.text ="O"
                    }
                    g.isClickable = false
                }

                R.id.h -> {
                    if (turnMain) {
                        playerOneMain.add('h')
                        h.text = "X"
                    } else {
                        playerTwoMain.add('h')
                        h.text ="O"
                    }
                    h.isClickable = false
                }

                R.id.i -> {
                    if (turnMain) {
                        playerOneMain.add('i')
                        i.text = "X"
                    } else {
                        playerTwoMain.add('i')
                        i.text ="O"
                    }
                    i.isClickable = false
                }
            }
        }
        checkWin()
    }

    private fun checkWin(){

        if (playerOneMain.containsAll(listOf('a', 'b', 'c')) ||
            playerOneMain.containsAll(listOf('d', 'e', 'f')) ||
            playerOneMain.containsAll(listOf('g', 'h', 'i')) ||
            playerOneMain.containsAll(listOf('a', 'd', 'g')) ||
            playerOneMain.containsAll(listOf('b', 'e', 'h')) ||
            playerOneMain.containsAll(listOf('c', 'f', 'i')) ||
            playerOneMain.containsAll(listOf('a', 'e', 'i')) ||
            playerOneMain.containsAll(listOf('c', 'e', 'g'))
        ) {
            scoreOneMain += 1
            playerOne.text = "player one: $scoreOneMain"
            reset()
            playerWinMain = "player one win"

        } else if (playerTwoMain.containsAll(listOf('a', 'b', 'c')) ||
            playerTwoMain.containsAll(listOf('d', 'e', 'f')) ||
            playerTwoMain.containsAll(listOf('g', 'h', 'i')) ||
            playerTwoMain.containsAll(listOf('a', 'd', 'g')) ||
            playerTwoMain.containsAll(listOf('b', 'e', 'h')) ||
            playerTwoMain.containsAll(listOf('c', 'f', 'i')) ||
            playerTwoMain.containsAll(listOf('a', 'e', 'i')) ||
            playerTwoMain.containsAll(listOf('c', 'e', 'g'))
        ) {
            scoreTwoMain += 1
            playerTwo.text = "player Two: $scoreTwoMain"
            reset()
            playerWinMain = "player two win"

        } else {
            turnMain = !turnMain
        }
    }

    private fun reset(){
        playerOneMain.clear()
        playerTwoMain.clear()
        a.text = ""
        a.isClickable = true
        b.text = ""
        b.isClickable = true
        c.text = ""
        c.isClickable = true
        d.text = ""
        d.isClickable = true
        e.text = ""
        e.isClickable = true
        f.text = ""
        f.isClickable = true
        g.text = ""
        g.isClickable = true
        h.text = ""
        h.isClickable = true
        i.text = ""
        i.isClickable = true
    }

}
/*
var playerOneMain = mutableListOf<Char>()
    var playerTwoMain = mutableListOf<Char>()
    var turnMain = true
    var scoreOneMain = 0
    var scoreTwoMain = 0
    var playerWinMain = ""
 */