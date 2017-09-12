//
// removes '.git' from url for github plugin
//

@NonCPS
def call(url) {
	
	def git_exp = /.+\.git\/*$/
	def matches = url =~ git_exp

	return ( matches ) ? url.substring(0, url.indexOf('.git')) + '/' : url
}
