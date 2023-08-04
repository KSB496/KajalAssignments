function dateValidate() {
        d1 = document.getElementById('date').value
        d = new Date(d1)
        date = d.getDate()
        shortmonth = d.toLocaleString('default', { month: 'short' })
        //month=d.getMonth() 
        year = d.getFullYear()
        //return date + "-" + month + "-" + year
        format = date + "-" + shortmonth + "-" + year
        
        if (date >= 31 && date <= 1) {
                console.log('Enter Valid Date ' + date)
                if (month >= 12 && month <= 1) {
                        document.write('Enter Valid Month ' + month)
                        if (year.length >= 4 && year.length <= 1) {
                                document.write('Enter Valid Year ' + year)
                                return 0
                        }
                        else {
                                newwin = window.open('display.html', 'newone', "width=100;height=100;toolbar=no")
                                newwin.document.write('Successful Validation ' + format)
                        }
                        return 0
                }
                return 0
        }
}