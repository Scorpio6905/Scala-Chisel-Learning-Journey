package Gates
import chisel3._
import javax.swing.UIManager.LookAndFeelInfo


class Mux8to1 extends Module {
    val io = IO(new Bundle{

            val a = Input(Bool())
            val b = Input(Bool())
            val c = Input(Bool())
            val d = Input(Bool())
            val e = Input(Bool())
            val f = Input(Bool())
            val g = Input(Bool())
            val h = Input(Bool())
            val s1 = Input(Bool())
            val s2 = Input(Bool())
            val s3 = Input(Bool()) 
            val out = Output(Bool())
    
    })

    val mux1 = Module(new Mux2to1)
    val mux2 = Module(new Mux2to1)
    val mux3 = Module(new Mux2to1)
    val mux4 = Module(new Mux2to1)
    val mux5 = Module(new Mux2to1)
    val mux6 = Module(new Mux2to1)
    val mux7 = Module(new Mux2to1)


    mux1.io.a := io.a
    mux1.io.b := io.b
    mux1.io.s1 := io.s1

    mux2.io.a := io.c
    mux2.io.b := io.d
    mux2.io.s1 := io.s1 

    mux3.io.a := io.e
    mux3.io.b := io.f
    mux3.io.s1 := io.s1

    mux4.io.a := io.g
    mux4.io.b := io.h
    mux4.io.s1 := io.s1
 
    mux5.io.a := mux1.io.out
    mux5.io.b := mux2.io.out
    mux5.io.s1 := io.s2

  
    mux6.io.a := mux3.io.out
    mux6.io.b := mux4.io.out
    mux6.io.s1 := io.s2


    mux7.io.a := mux5.io.out
    mux7.io.b := mux6.io.out
    mux7.io.s1 := io.s3 

    io.out := mux7.io.out   
    
}