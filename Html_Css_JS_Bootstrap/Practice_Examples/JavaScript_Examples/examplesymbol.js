const SECRET = Symbol('secret')
	let data = { }
	data[SECRET] = 10
	let newData = Object.assign({ }, data)
	

	Object.getOwnPropertyNames(data)  // []
	(SECRET in data)                  // true
	(SECRET in newData)               // true
