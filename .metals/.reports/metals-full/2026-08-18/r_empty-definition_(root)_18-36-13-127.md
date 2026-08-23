error id: file://<WORKSPACE>/src/main/scala/Gates/gates.scala:Gates/gates#io.
file://<WORKSPACE>/src/main/scala/Gates/gates.scala
empty definition using pc, found symbol in pc: 
found definition using semanticdb; symbol Gates/gates#io.
empty definition using fallback
non-local guesses:

offset: 627
uri: file://<WORKSPACE>/src/main/scala/Gates/gates.scala
text:
```scala
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

   io.or_output := io.a || io@@.b
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

```


#### Short summary: 

empty definition using pc, found symbol in pc: 