package Gates
import chisel3._
import javax.swing.UIManager.LookAndFeelInfo

class Full_Adder extends Module {
    val io = IO(new Bundle{

            val a = Input(Bool())
            val b = Input(Bool())
            val c= Input(Bool()) 
            val sum = Output(Bool())
            val cout = Output(Bool())
    
    })

    val xor_output1 = io.a ^ io.b
    io.sum := xor_output1 ^ io.c
    val and_output1 = io.a & io.b
    val and_output2 = xor_output1 & io.c
    io.cout := and_output1 || and_output2
}