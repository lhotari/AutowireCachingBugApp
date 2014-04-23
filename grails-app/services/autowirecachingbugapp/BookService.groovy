package autowirecachingbugapp

import grails.transaction.Transactional

//@Transactional
class BookService {

    def serviceMethod() {
    	println "called serviceMethod in BookService"
    }
}
