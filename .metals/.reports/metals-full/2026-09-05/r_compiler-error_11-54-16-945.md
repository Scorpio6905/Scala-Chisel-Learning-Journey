error id: 2235332853008D622CE3C7D1B3C42561
file://<WORKSPACE>/src/test/scala/lab3/ImmGentest.scala
### java.lang.NullPointerException: Cannot invoke "scala.meta.internal.pc.CompilerWrapper.compiler()" because "access" is null

occurred in the presentation compiler.



action parameters:
uri: file://<WORKSPACE>/src/test/scala/lab3/ImmGentest.scala
text:
```scala
package lab3

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._
import scala.util.Random


class ImmGentest extends FreeSpec with ChiselScalatestTester {
  "ImmdValGen immediate extraction" in {
    test(new ImmdValGen) { dut =>
      
      val op_array = Array( "b0010011", "b0000011", "b1100111", "b0100011", "b1100011", "b0110111", "b0010111", "b1101111" ) 
      val opcode = op_array(Random.nextInt(8)) 
      
      val imm = Random.nextInt() & 0xFFF
      val reg = Random.nextInt(32)

      // val instr = "b00000000101000000000000010010011".U
      // val opcode = instr(6, 0)
      val instr = Cat(opcode.U, reg.U(5), 0.U(5.W), )
      val result = opcode match {
        case x if x === "b0010011".U || x === "b0000011".U || x === "b1100111".U =>
          val immbits = instr(31, 20)
          val sign_ext = Fill(20, instr(31))
          Cat(sign_ext, immbits)

        case x if x === "b0100011".U =>
          val immbits = Cat(instr(31, 25), instr(11, 7))
          val sign_ext = Fill(20, instr(31))
          Cat(sign_ext, immbits)

        case x if x === "b1100011".U =>
          val immbits = Cat(instr(31), instr(7), instr(30, 25), instr(11, 8), 0.U(1.W))
          val sign_ext = Fill(19, instr(31))
          Cat(sign_ext, immbits)

        case x if x === "b0110111".U || x === "b0010111".U =>
          val immbits = instr(31, 12)
          val bit_ext = Fill(12, 0.U)
          Cat(immbits, bit_ext)

        case x if x === "b1101111".U =>
          val immbits = Cat(instr(31, 30), instr(19, 12), instr(20), instr(30, 21), 0.U(1.W))
          val sign_ext = Fill(11, instr(31))
          Cat(sign_ext, immbits)

        case _ =>
          0.U(32.W)
      }

      dut.io.instr.poke(instr)
      dut.io.immd_se.expect(result)
    }
  }
}
```


presentation compiler configuration:
Scala version: 3.3.8-bin-nonbootstrapped
Classpath:
<HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.8/scala3-library_3-3.3.8.jar [exists ], <HOME>/.cache/coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.18/scala-library-2.13.18.jar [exists ]
Options:





#### Error stacktrace:

```
dotty.tools.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:174)
	scala.meta.internal.pc.CompilerAccess.withSharedCompiler(CompilerAccess.scala:149)
	scala.meta.internal.pc.CompilerAccess.$anonfun$1(CompilerAccess.scala:93)
	scala.meta.internal.pc.CompilerAccess.onCompilerJobQueue$$anonfun$1(CompilerAccess.scala:210)
	scala.meta.internal.pc.CompilerJobQueue$Job.run(CompilerJobQueue.scala:153)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	java.base/java.lang.Thread.run(Thread.java:840)
```
#### Short summary: 

java.lang.NullPointerException: Cannot invoke "scala.meta.internal.pc.CompilerWrapper.compiler()" because "access" is null