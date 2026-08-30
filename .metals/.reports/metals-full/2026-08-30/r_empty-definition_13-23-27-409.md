error id: file://<WORKSPACE>/src/main/scala/lab3/BranchControl.scala:
file://<WORKSPACE>/src/main/scala/lab3/BranchControl.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -Input.
	 -Input#
	 -Input().
	 -scala/Predef.Input.
	 -scala/Predef.Input#
	 -scala/Predef.Input().
offset: 167
uri: file://<WORKSPACE>/src/main/scala/lab3/BranchControl.scala
text:
```scala
package lab3
import chisel3._
import chisel3.util._
class LM_IO_Interface_BranchControl extends Bundle {
val fnct3 = Input(UInt(3.W))
val branch
val arg_x
val arg_y
= @@Input(Bool())
= Input(UInt(32.W))
= Input(UInt(32.W))
val br_taken = Output(Bool())
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 