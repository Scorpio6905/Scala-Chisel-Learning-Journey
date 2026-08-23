package Gates
import chisel3._
import javax.swing.UIManager.LookAndFeelInfo


class Mux2to1 extends Module {
    val io = IO(new Bundle{

            val a = Input(Bool())
            val b = Input(Bool())
            val s1 = Input(Bool()) 
            val out = Output(Bool())
    
    })

    val and_output1 = io.a & ~(io.s1)
    val and_output2 = io.b & io.s1
    io.out := and_output1 || and_output2
    
    }
