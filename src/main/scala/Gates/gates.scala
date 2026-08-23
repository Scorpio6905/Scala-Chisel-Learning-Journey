package Gates
import chisel3._
import javax.swing.UIManager.LookAndFeelInfo

class gates extends Module {
    val io = IO(new Bundle{

            val a = Input(Bool())
            val b = Input(Bool())
            val and_output= Output(Bool())
            val or_output= Output(Bool())
            val not_output= Output(Bool())
            val xor_output= Output(Bool())
            val xnor_output= Output(Bool())
            val nand_output= Output(Bool())
            val nor_output= Output(Bool()) 
            

    })
   io.and_output := io.a & io.b
   println(s"Result: $io.and_output")

   io.or_output := io.a || io.b
   println(s"Result: $io.and_output")

   io.not_output := ~io.a  
   println(s"Result: $io.and_output")

   io.xor_output := io.a ^ io.b
   println(s"Result: $io.and_output")

   io.xnor_output := ~(io.a ^ io.b)
   println(s"Result: $io.and_output")

   io.nand_output := ~(io.a & io.b)
   println(s"Result: $io.and_output")

   io.nor_output := ~(io.a || io.b)
   println(s"Result: $io.and_output")

}
