fun unifyTime(obj) = do {
    var timePeriod = 
    if (obj.date != null)
        now() - obj.date as DateTime 
    else
        now() - obj.newDate as DateTime
    ---
    timePeriod
}