error id: file://<WORKSPACE>/src/main/scala/Gates/Adder.scala:chisel3/package.Bool.
file://<WORKSPACE>/src/main/scala/Gates/Adder.scala
empty definition using pc, found symbol in pc: 
found definition using semanticdb; symbol chisel3/package.Bool.
empty definition using fallback
non-local guesses:

offset: 235
uri: file://<WORKSPACE>/src/main/scala/Gates/Adder.scala
text:
```scala
package Gates
import chisel3._
import javax.swing.UIManager.LookAndFeelInfo

class Adder extends Module {
    val io = IO(new Bundle{

            val a1 = Input(Bool())
            val b1 = Input(Bool())
            val a2= Input(Bool@@()) 
            val sum = Output(Bool())
            val cout = Output(Bool())
    
    })


    val halfadder = new Half_Adder
    val fulladder = new Full_Adder
     
     fulladder.io.c := halfadder.io.carry_output

     fulladder.io.a := io.
    


    
    }
```


#### Short summary: 

empty definition using pc, found symbol in pc: 