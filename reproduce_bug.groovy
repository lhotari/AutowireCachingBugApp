import autowirecachingbugapp.*
import java.util.concurrent.*

//new Book(name:'The Book').save(flush:true)

ctx.beanFactory.reloadEnabled = false
ctx.beanFactory.autowireableBeanPropsCacheForClass = new ConcurrentHashMap()
println ctx.beanFactory.autowireableBeanPropsCacheForClass[Book.class]

try {
   ctx.beanFactory.populateBeanInAutowireByName(Book.load(1))
} catch(Throwable t) {
   t.printStackTrace()
}

println ctx.beanFactory.autowireableBeanPropsCacheForClass[Book.class]['bookService'].writeMethod