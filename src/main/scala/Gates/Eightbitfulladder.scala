package Gates
import chisel3._
import javax.swing.UIManager.LookAndFeelInfo


class Eightbitfulladder extends Module {
    val io = IO(new Bundle{

            val a1 = Input(Bool())
            val a2 = Input(Bool())
            val a3 = Input(Bool())
            val a4 = Input(Bool())
            val a5 = Input(Bool())
            val a6 = Input(Bool())
            val a7 = Input(Bool())
            val a8 = Input(Bool())
            
            val b1 = Input(Bool())
            val b2 = Input(Bool())
            val b3 = Input(Bool())
            val b4 = Input(Bool())
            val b5 = Input(Bool())
            val b6 = Input(Bool())
            val b7 = Input(Bool())
            val b8 = Input(Bool())

           val sum1 = Output(Bool())
           val sum2 = Output(Bool())
           val sum3 = Output(Bool())
           val sum4 = Output(Bool())
           val sum5 = Output(Bool())
           val sum6 = Output(Bool())
           val sum7 = Output(Bool())
           val sum8 = Output(Bool())

           val cout = Output(Bool())
    
    })
    
    val halfadder = Module(new Half_Adder)
    val fulladder1 = Module(new Full_Adder)
    val fulladder2 = Module(new Full_Adder)
    val fulladder3 = Module(new Full_Adder)
    val fulladder4 = Module(new Full_Adder)
    val fulladder5 = Module(new Full_Adder)
    val fulladder6 = Module(new Full_Adder)
    val fulladder7 = Module(new Full_Adder)


    fulladder1.io.c := halfadder.io.carry_output
    fulladder2.io.c := fulladder1.io.cout
    fulladder3.io.c := fulladder2.io.cout
    fulladder4.io.c := fulladder3.io.cout
    fulladder5.io.c := fulladder4.io.cout
    fulladder6.io.c := fulladder5.io.cout 
    fulladder7.io.c := fulladder6.io.cout  

    halfadder.io.a := io.a1
    halfadder.io.b := io.b1

    fulladder1.io.a := io.a2
    fulladder1.io.b := io.b2
    fulladder2.io.a := io.a3
    fulladder2.io.b := io.b3
    fulladder3.io.a := io.a4
    fulladder3.io.b := io.b4
    fulladder4.io.a := io.a5
    fulladder4.io.b := io.b5
    fulladder5.io.a := io.a6
    fulladder5.io.b := io.b6
    fulladder6.io.a := io.a7
    fulladder6.io.b := io.b7
    fulladder7.io.a := io.a8
    fulladder7.io.b := io.b8

    io.sum1 := halfadder.io.sum_output
    io.sum2 := fulladder1.io.sum
    io.sum3 := fulladder2.io.sum
    io.sum4 := fulladder3.io.sum
    io.sum5 := fulladder4.io.sum
    io.sum6 := fulladder5.io.sum
    io.sum7 := fulladder6.io.sum
    io.sum8 := fulladder7.io.sum
    
    io.cout := fulladder7.io.cout


  
    }