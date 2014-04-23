import autowirecachingbugapp.*
import java.util.concurrent.*

ctx.beanFactory.reloadEnabled = false
ctx.beanFactory.autowireableBeanPropsCacheForClass = new ConcurrentHashMap()
println ctx.beanFactory.autowireableBeanPropsCacheForClass[Book.class]

try {
   ctx.beanFactory.populateBeanInAutowireByName(Book.load(1))
} catch(Throwable t) {
   t.printStackTrace()
}

new Book(name:'The Book').save(flush:true)

println ctx.beanFactory.autowireableBeanPropsCacheForClass[Book.class]['bookService'].writeMethod