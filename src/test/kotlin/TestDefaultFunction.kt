import org.example.myMax
import org.example.myMin
import kotlin.test.Test

class TestDefaultFunction{
    @Test
    fun `max return max`(){
        val a: Int = 5
        val b: Int = 100;
       assert(myMax(a, b) == b)
    }

    @Test
    fun `min return min`(){
        val a: Int = 5
        val b: Int = 100;
        assert(myMin(a, b) == a)
    }
}