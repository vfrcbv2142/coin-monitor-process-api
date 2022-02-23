import substring from dw::core::Strings

fun timeDiff(obj) = do {
	var timeDifference = unifyTime(obj).days as String ++ " days, " 
				++ unifyTime(obj).hours as String ++ " hours, " 
                ++ unifyTime(obj).minutes as String ++ " minutes, " 
                ++ substring((unifyTime(obj).seconds as String), 0, 2) 
                ++ " seconds"
    ---
    timeDifference
}