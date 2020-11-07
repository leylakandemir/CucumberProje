@koalapalace
  Feature: Koala Palace

    Background: Koala Palace Admin Giris
      Given kullanici koalapalace admin sayfasina gider
      And kullanici kullaniciadi ve sifresini girer
      Then kullanici giris islemini gerceklestirir

     @hotelcreate
      Scenario: TC09_kullanici bilgileri girerek hotel olusturur
        Given kullanici hotelcreate sayfasina gider
        And kullanici hotelcreate code bolumune "1234" girer
        And kullanici hotelcreate name bolumune "test" girer
        And kullanici hotelcreate adress bolumune "cikmaz sokak" girer
        And kullanici hotelcreate phone bolumune "2345677888999" girer
        And kullanici hotelcreate email bolumune "hamza@tech." girer
        And kullanici hotelcreate idgroup bolumune "Hotel Type1" secer
        And kullanici hotelcreate save butonuna tiklar
        Then kullanici hotelcreate kayit islemini assert eder

       @hotelroomcreate
       Scenario: TC10_kullanici bilgileri girerek hotel room olusturur
         Given kullanici hotelroomcreate sayfasina gider
         And kullanici hotelroomcreate idhotel bolumunde "sonDers" secer
         And kullanici hotelroomcreate code bolumune "1235554" girer
         And kullanici hotelroomcreate name bolumune "sena22" girer
         And kullanici hotelroomcreate location bolumune "lale sokak" girer
         And kullanici hotelroomcreate description bolumune "ljlisjfoiejoifldlkdslrejlk,fkl" girer
         And kullanici hotelroomcreate price bolumunde "500" secer ve surukler
         And kullanici hotelroomcreate roomType bolumunde "Queen" secer
         And kullanici hotelroomcreate maxAdultCount bolumunde "5" yazar
         And kullanici hotelroomcreate maxChildrenCount bolumunde "6" yazar
         And kullanici hotelroomcreate save bolumunde butona tiklar
         Then kullanici hotelroomcreate kayit islemini assert eder

         @hotelreservationcreate
         Scenario: TC11_kullanici bilgileri girerek hotel reservation olusturur
           Given kullanici hotelreservationcreate sayfasina gider
           And kullanici hotelreservationcreate IDUser bolumunde "manager2" secer
           And kullanici hotelreservationcreate IDUserHotelRoom bolumunde "Hilton" secer
           And kullanici hotelreservationcreate Price bolumunde "500" girer
           And kullanici hotelreservationcreate DateStart bolumunde "11/09/2020" secer
           And kullanici hotelreservationcreate DateEnd bolumunde "11/14/2020" secer
           And kullanici hotelreservationcreate AdultAmount bolumunde "5" girer
           And kullanici hotelreservationcreate ChildrenAmount bolumunde "2" secer
           And kullanici hotelreservationcreate ContactNameSurname bolumunde "King Ahmet" secer
           And kullanici hotelreservationcreate ContactPhone bolumunde "5655788888800" girer
           And kullanici hotelreservationcreate ContactEmail bolumunde "kkjds@lmkmld.et" secer
           And kullanici hotelreservationcreate Notes bolumunde "565jj:khjfdtreerszeqz" girer
           And kullanici hotelreservationcreate save butonuna tiklar
           Then kullanici hotelreservationcreate kayit islemini assert eder

    @hotelreservationcreate
    @hotelreservationnegativetests
    @hotelreservationnegativetest1
      Scenario: TC_12kullanici iduser secmeden room reservation olusturur
      Given kullanici hotelreservationcreate sayfasina gider
      # And kullanici hotelreservationcreate IDUser bolumunde "manager2" secer
      And kullanici hotelreservationcreate IDUserHotelRoom bolumunde "Hilton" secer
      And kullanici hotelreservationcreate Price bolumunde "500" girer
      And kullanici hotelreservationcreate DateStart bolumunde "11/09/2020" secer
      And kullanici hotelreservationcreate DateEnd bolumunde "11/14/2020" secer
      And kullanici hotelreservationcreate AdultAmount bolumunde "5" girer
      And kullanici hotelreservationcreate ChildrenAmount bolumunde "2" secer
      And kullanici hotelreservationcreate ContactNameSurname bolumunde "King Ahmet" secer
      And kullanici hotelreservationcreate ContactPhone bolumunde "5655788888800" girer
      And kullanici hotelreservationcreate ContactEmail bolumunde "kkjds@lmkmld.et" secer
      And kullanici hotelreservationcreate Notes bolumunde "565jj:khjfdtreerszeqz" girer
      And kullanici hotelreservationcreate save butonuna tiklar
      Then kullanici hotelreservation kayit isleminin basarisiz oldugunu assert eder

    @hotelreservationcreate
    @hotelreservationnegativetests
    @hotelreservationnegativetest2
    Scenario: TC_13kullanici IDUserHotelRoom secmeden room reservation olusturur
      Given kullanici hotelreservationcreate sayfasina gider
      And kullanici hotelreservationcreate IDUser bolumunde "manager2" secer
      # And kullanici hotelreservationcreate IDUserHotelRoom bolumunde "Hilton" secer
      And kullanici hotelreservationcreate Price bolumunde "500" girer
      And kullanici hotelreservationcreate DateStart bolumunde "11/09/2020" secer
      And kullanici hotelreservationcreate DateEnd bolumunde "11/14/2020" secer
      And kullanici hotelreservationcreate AdultAmount bolumunde "5" girer
      And kullanici hotelreservationcreate ChildrenAmount bolumunde "2" secer
      And kullanici hotelreservationcreate ContactNameSurname bolumunde "King Ahmet" secer
      And kullanici hotelreservationcreate ContactPhone bolumunde "5655788888800" girer
      And kullanici hotelreservationcreate ContactEmail bolumunde "kkjds@lmkmld.et" secer
      And kullanici hotelreservationcreate Notes bolumunde "565jj:khjfdtreerszeqz" girer
      And kullanici hotelreservationcreate save butonuna tiklar
      Then kullanici hotelreservation kayit isleminin basarisiz oldugunu assert eder

    @hotelreservationcreate
    @hotelreservationnegativetests
    @hotelreservationnegativetest3
    Scenario: TC_14kullanici Price secmeden room reservation olusturur
      Given kullanici hotelreservationcreate sayfasina gider
      And kullanici hotelreservationcreate IDUser bolumunde "manager2" secer
      And kullanici hotelreservationcreate IDUserHotelRoom bolumunde "Hilton" secer
      # And kullanici hotelreservationcreate Price bolumunde "500" girer
      And kullanici hotelreservationcreate DateStart bolumunde "11/09/2020" secer
      And kullanici hotelreservationcreate DateEnd bolumunde "11/14/2020" secer
      And kullanici hotelreservationcreate AdultAmount bolumunde "5" girer
      And kullanici hotelreservationcreate ChildrenAmount bolumunde "2" secer
      And kullanici hotelreservationcreate ContactNameSurname bolumunde "King Ahmet" secer
      And kullanici hotelreservationcreate ContactPhone bolumunde "5655788888800" girer
      And kullanici hotelreservationcreate ContactEmail bolumunde "kkjds@lmkmld.et" secer
      And kullanici hotelreservationcreate Notes bolumunde "565jj:khjfdtreerszeqz" girer
      And kullanici hotelreservationcreate save butonuna tiklar
      Then kullanici hotelreservation kayit isleminin basarisiz oldugunu assert eder

    @hotelreservationcreate
    @hotelreservationnegativetests
    @hotelreservationnegativetest4
    Scenario: TC_15kullanici DateStart secmeden room reservation olusturur
      Given kullanici hotelreservationcreate sayfasina gider
      And kullanici hotelreservationcreate IDUser bolumunde "manager2" secer
      And kullanici hotelreservationcreate IDUserHotelRoom bolumunde "Hilton" secer
      And kullanici hotelreservationcreate Price bolumunde "500" girer
       # And kullanici hotelreservationcreate DateStart bolumunde "11/09/2020" secer
      And kullanici hotelreservationcreate DateEnd bolumunde "11/14/2020" secer
      And kullanici hotelreservationcreate AdultAmount bolumunde "5" girer
      And kullanici hotelreservationcreate ChildrenAmount bolumunde "2" secer
      And kullanici hotelreservationcreate ContactNameSurname bolumunde "King Ahmet" secer
      And kullanici hotelreservationcreate ContactPhone bolumunde "5655788888800" girer
      And kullanici hotelreservationcreate ContactEmail bolumunde "kkjds@lmkmld.et" secer
      And kullanici hotelreservationcreate Notes bolumunde "565jj:khjfdtreerszeqz" girer
      And kullanici hotelreservationcreate save butonuna tiklar
      Then kullanici hotelreservation kayit isleminin basarisiz oldugunu assert eder

    @hotelreservationcreate
    @hotelreservationnegativetests
    @hotelreservationnegativetest5
    Scenario: TC_16kullanici DateEnd secmeden room reservation olusturur
      Given kullanici hotelreservationcreate sayfasina gider
      And kullanici hotelreservationcreate IDUser bolumunde "manager2" secer
      And kullanici hotelreservationcreate IDUserHotelRoom bolumunde "Hilton" secer
      And kullanici hotelreservationcreate Price bolumunde "500" girer
      And kullanici hotelreservationcreate DateStart bolumunde "11/09/2020" secer
       # And kullanici hotelreservationcreate DateEnd bolumunde "11/14/2020" secer
      And kullanici hotelreservationcreate AdultAmount bolumunde "5" girer
      And kullanici hotelreservationcreate ChildrenAmount bolumunde "2" secer
      And kullanici hotelreservationcreate ContactNameSurname bolumunde "King Ahmet" secer
      And kullanici hotelreservationcreate ContactPhone bolumunde "5655788888800" girer
      And kullanici hotelreservationcreate ContactEmail bolumunde "kkjds@lmkmld.et" secer
      And kullanici hotelreservationcreate Notes bolumunde "565jj:khjfdtreerszeqz" girer
      And kullanici hotelreservationcreate save butonuna tiklar
      Then kullanici hotelreservation kayit isleminin basarisiz oldugunu assert eder

    @hotelreservationcreate
    @hotelreservationnegativetests
    @hotelreservationnegativetest6
    Scenario: TC_17kullanici AdultAmount secmeden room reservation olusturur
      Given kullanici hotelreservationcreate sayfasina gider
      And kullanici hotelreservationcreate IDUser bolumunde "manager2" secer
      And kullanici hotelreservationcreate IDUserHotelRoom bolumunde "Hilton" secer
      And kullanici hotelreservationcreate Price bolumunde "500" girer
      And kullanici hotelreservationcreate DateStart bolumunde "11/09/2020" secer
      And kullanici hotelreservationcreate DateEnd bolumunde "11/14/2020" secer
       # And kullanici hotelreservationcreate AdultAmount bolumunde "5" girer
      And kullanici hotelreservationcreate ChildrenAmount bolumunde "2" secer
      And kullanici hotelreservationcreate ContactNameSurname bolumunde "King Ahmet" secer
      And kullanici hotelreservationcreate ContactPhone bolumunde "5655788888800" girer
      And kullanici hotelreservationcreate ContactEmail bolumunde "kkjds@lmkmld.et" secer
      And kullanici hotelreservationcreate Notes bolumunde "565jj:khjfdtreerszeqz" girer
      And kullanici hotelreservationcreate save butonuna tiklar
      Then kullanici hotelreservation kayit isleminin basarisiz oldugunu assert eder

    @hotelreservationcreate
    @hotelreservationnegativetests
    @hotelreservationnegativetest7
    Scenario: TC_18kullanici ChildrenAmount secmeden room reservation olusturur
      Given kullanici hotelreservationcreate sayfasina gider
      And kullanici hotelreservationcreate IDUser bolumunde "manager2" secer
      And kullanici hotelreservationcreate IDUserHotelRoom bolumunde "Hilton" secer
      And kullanici hotelreservationcreate Price bolumunde "500" girer
      And kullanici hotelreservationcreate DateStart bolumunde "11/09/2020" secer
      And kullanici hotelreservationcreate DateEnd bolumunde "11/14/2020" secer
      And kullanici hotelreservationcreate AdultAmount bolumunde "5" girer
       # And kullanici hotelreservationcreate ChildrenAmount bolumunde "2" secer
      And kullanici hotelreservationcreate ContactNameSurname bolumunde "King Ahmet" secer
      And kullanici hotelreservationcreate ContactPhone bolumunde "5655788888800" girer
      And kullanici hotelreservationcreate ContactEmail bolumunde "kkjds@lmkmld.et" secer
      And kullanici hotelreservationcreate Notes bolumunde "565jj:khjfdtreerszeqz" girer
      And kullanici hotelreservationcreate save butonuna tiklar
      Then kullanici hotelreservation kayit isleminin basarisiz oldugunu assert eder

    @hotelreservationcreate
    @hotelreservationnegativetests
    @hotelreservationnegativetest8
    Scenario: TC_19kullanici ContactNameSurname secmeden room reservation olusturur
      Given kullanici hotelreservationcreate sayfasina gider
      And kullanici hotelreservationcreate IDUser bolumunde "manager2" secer
      And kullanici hotelreservationcreate IDUserHotelRoom bolumunde "Hilton" secer
      And kullanici hotelreservationcreate Price bolumunde "500" girer
      And kullanici hotelreservationcreate DateStart bolumunde "11/09/2020" secer
      And kullanici hotelreservationcreate DateEnd bolumunde "11/14/2020" secer
      And kullanici hotelreservationcreate AdultAmount bolumunde "5" girer
      And kullanici hotelreservationcreate ChildrenAmount bolumunde "2" secer
      # And kullanici hotelreservationcreate ContactNameSurname bolumunde "King Ahmet" secer
      And kullanici hotelreservationcreate ContactPhone bolumunde "5655788888800" girer
      And kullanici hotelreservationcreate ContactEmail bolumunde "kkjds@lmkmld.et" secer
      And kullanici hotelreservationcreate Notes bolumunde "565jj:khjfdtreerszeqz" girer
      And kullanici hotelreservationcreate save butonuna tiklar
      Then kullanici hotelreservation kayit isleminin basarisiz oldugunu assert eder

    @hotelreservationcreate
    @hotelreservationnegativetests
    @hotelreservationnegativetest9
    Scenario: TC_20kullanici ContactPhone secmeden room reservation olusturur
      Given kullanici hotelreservationcreate sayfasina gider
      And kullanici hotelreservationcreate IDUser bolumunde "manager2" secer
      And kullanici hotelreservationcreate IDUserHotelRoom bolumunde "Hilton" secer
      And kullanici hotelreservationcreate Price bolumunde "500" girer
      And kullanici hotelreservationcreate DateStart bolumunde "11/09/2020" secer
      And kullanici hotelreservationcreate DateEnd bolumunde "11/14/2020" secer
      And kullanici hotelreservationcreate AdultAmount bolumunde "5" girer
      And kullanici hotelreservationcreate ChildrenAmount bolumunde "2" secer
      And kullanici hotelreservationcreate ContactNameSurname bolumunde "King Ahmet" secer
      # And kullanici hotelreservationcreate ContactPhone bolumunde "5655788888800" girer
      And kullanici hotelreservationcreate ContactEmail bolumunde "kkjds@lmkmld.et" secer
      And kullanici hotelreservationcreate Notes bolumunde "565jj:khjfdtreerszeqz" girer
      And kullanici hotelreservationcreate save butonuna tiklar
      Then kullanici hotelreservation kayit isleminin basarisiz oldugunu assert eder

    @hotelreservationcreate
    @hotelreservationnegativetests
    @hotelreservationnegativetest10
    Scenario: TC_21kullanici ContactEmail secmeden room reservation olusturur
      Given kullanici hotelreservationcreate sayfasina gider
      And kullanici hotelreservationcreate IDUser bolumunde "manager2" secer
      And kullanici hotelreservationcreate IDUserHotelRoom bolumunde "Hilton" secer
      And kullanici hotelreservationcreate Price bolumunde "500" girer
      And kullanici hotelreservationcreate DateStart bolumunde "11/09/2020" secer
      And kullanici hotelreservationcreate DateEnd bolumunde "11/14/2020" secer
      And kullanici hotelreservationcreate AdultAmount bolumunde "5" girer
      And kullanici hotelreservationcreate ChildrenAmount bolumunde "2" secer
      And kullanici hotelreservationcreate ContactNameSurname bolumunde "King Ahmet" secer
      And kullanici hotelreservationcreate ContactPhone bolumunde "5655788888800" girer
      # And kullanici hotelreservationcreate ContactEmail bolumunde "kkjds@lmkmld.et" secer
      And kullanici hotelreservationcreate Notes bolumunde "565jj:khjfdtreerszeqz" girer
      And kullanici hotelreservationcreate save butonuna tiklar
      Then kullanici hotelreservation kayit isleminin basarisiz oldugunu assert eder

    @hotelreservationcreate
    @hotelreservationnegativetests
    @hotelreservationnegativetest11
    Scenario: TC_22kullanici datestarti dateendden sonra girerek olusturur
      Given kullanici hotelreservationcreate sayfasina gider
      And kullanici hotelreservationcreate IDUser bolumunde "manager2" secer
      And kullanici hotelreservationcreate IDUserHotelRoom bolumunde "Hilton" secer
      And kullanici hotelreservationcreate Price bolumunde "500" girer
      And kullanici hotelreservationcreate DateStart bolumunde "11/30/2020" secer
      And kullanici hotelreservationcreate DateEnd bolumunde "11/14/2020" secer
      And kullanici hotelreservationcreate AdultAmount bolumunde "5" girer
      And kullanici hotelreservationcreate ChildrenAmount bolumunde "2" secer
      And kullanici hotelreservationcreate ContactNameSurname bolumunde "King Ahmet" secer
      And kullanici hotelreservationcreate ContactPhone bolumunde "5655788888800" girer
      And kullanici hotelreservationcreate ContactEmail bolumunde "kkjds@lmkmld.et" secer
      And kullanici hotelreservationcreate Notes bolumunde "565jj:khjfdtreerszeqz" girer
      And kullanici hotelreservationcreate save butonuna tiklar
      Then kullanici hotelreservation kayit isleminin basarisiz oldugunu assert eder

      @hotelsearch
      Scenario: TC_23kullanici hotellist sayfasinda code girerek hotel arar
        Given kullanici hotellist sayfasina gider
        And kullanici hotellist code bolumune "1234" girer
        And kullanici hotellist search butonuna tiklar
        Then kullanici hotellist bolumundeki kayitlari inceler

        @hotelroomsearch
        Scenario: TC24_kullanici hotelroomlist sayfasinda verileri girerek hotelroom arar
          Given kullanici hotelroomlist sayfasina gider
          And kullanici hotelroomlist idhotel bolumunde "Star" secer
          And kullanici hotelroomlist code bolumune "12345" girer
          And kullanici hotelroomlist name bolumune "Techproed" girer
          And kullanici hotelroomlist location bolumune "USA" girer
          And kullanici hotelroomcreate search butonuna tiklar
          Then kullanici hotelroomlist bolumundeki kayitlari inceler

    @hotelsearchnegative01
    Scenario: TC_25kullanici hotellist sayfasinda code girerek hotel arar
      Given kullanici hotellist sayfasina gider
      And kullanici hotellist code bolumune "-10" girer
      And kullanici hotellist search butonuna tiklar
      Then kullanici hotellist bolumunde kayit bulunamadi yazisini gorur

      @hotelresevationsearch
      Scenario: TX26_kullanici hotelreservationlist sayfasinda verileri gorerek reservation yapar
        Given kullanici hotelroomreservationlist sayfasina gider
        And kullanici hotelroomreservationlist hotelroomid bolumunde "team06" secer
        And kullanici hotelroomreservationlist arama kutusuna tiklar
        Then kullanici hotelroomreservationlist kayitlarini inceler

        @hoteledit
        Scenario: TC27_kullanici hoteledit sayfasinda duzenleme yapar
          Given user goes to hoteledit website
          And user edits code part "3333"
          And user edits name part "leyla"
          And user edits address part "sevgi sok."
          And user edits phone part "235678888"
          And user edits email part "k,lkdks.kldjlks."
          And user selects group part "Hotel Type2"
          Then user clicks save button
          Then user assert this process

    @hotelroomedit
    Scenario: TC28_kullanici hotelroomedit sayfasinda duzenleme yapar
      Given user goes to hotelroomedit website "http://www.kaolapalace-qa-environment2.com/admin/HotelRoomAdmin/Edit?Id=148"
      And user clicks properties part
      And user selects "room prop1" part
      And user writes code "4444"
      Then user writes as value "sistem bozuldu"
      And user clicks save2 button
      Then user asserts new record on properties







