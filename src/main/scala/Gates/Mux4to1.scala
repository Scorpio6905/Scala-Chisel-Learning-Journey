package Gates
import chisel3._
import javax.swing.UIManager.LookAndFeelInfo


class Mux4to1 extends Module {
    val io = IO(new Bundle{

            val a = Input(Bool())
            val b = Input(Bool())
            val c = Input(Bool())
            val d = Input(Bool())
            val s1 = Input(Bool())
            val s2 = Input(Bool()) 
            val out = Output(Bool())
    
    })

    



    
}