fun unifyDate(obj) = do {
    var chosenDate = {
        (date: obj.date) if (obj.date != null),
        (newDate: obj.newDate) if (obj.newDate != null),
        (oldDate: obj.oldDate) if (obj.oldDate != null),
        (dateDif: obj.dateDifference) if (obj.dateDifference != null)
    }
    ---
    chosenDate
}