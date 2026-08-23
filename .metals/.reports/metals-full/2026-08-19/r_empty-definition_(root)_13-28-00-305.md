error id: file://<WORKSPACE>/src/main/scala/Gates/Adder.scala:local0
file://<WORKSPACE>/src/main/scala/Gates/Adder.scala
empty definition using pc, found symbol in pc: local0
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/fulladder/io/c.
	 -chisel3/fulladder/io/c#
	 -chisel3/fulladder/io/c().
	 -fulladder/io/c.
	 -fulladder/io/c#
	 -fulladder/io/c().
	 -scala/Predef.fulladder.io.c.
	 -scala/Predef.fulladder.io.c#
	 -scala/Predef.fulladder.io.c().
offset: 513
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
            val a2= Input(Bool()) 
            val b2= Input(Bool()) 
            val sum1 = Output(Bool())
            val sum2= Output(Bool())  
            val cout = Output(Bool())
    
    })


    val halfadder = Module(new Half_Adder)
    val fulladder = Module(new Full_Adder)
     
    fulladder.io.@@c := halfadder.io.carry_output

    halfadder.io.a := io.a1
    halfadder.io.b := io.b1 
    fulladder.io.a := io.a2        
    fulladder.io.b := io.b2

    io.sum1 := halfadder.io.sum_output 
    io.sum2 := fulladder.io.sum
    io.cout := fulladder.io.cout

    }
```


#### Short summary: 

empty definition using pc, found symbol in pc: local0