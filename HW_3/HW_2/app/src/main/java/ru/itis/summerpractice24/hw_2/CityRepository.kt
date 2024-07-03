package ru.itis.summerpractice24.hw_2

object CityRepository {
    val cities: List<City> = listOf(
        City(id = 0, name = "Kazan", country = "Russia", "https://obkomprof.ru/storage/app/uploads/public/65c/e16/1dd/65ce161dd43b9649787436.png",
            "Казань — один из старейших городов России, знаменит своим культурным наследием и архитектурой. Город стоит на месте слияния рек Волги и Казанки и известен своим кремлем, включая собор Кул-Шариф, который является символом города."),
        City(id = 1, name = "Sterlitamak", country = "Russia", "https://ic.pics.livejournal.com/zdorovs/16627846/1856312/1856312_original.jpg", "Стерлитамак — город в Башкортостане, расположенный на реке Белая. Это крупный промышленный и культурный центр региона, известный своей развитой химической и нефтехимической промышленностью. Вокруг города простираются живописные природные ландшафты, включая горные массивы Шиханы и заповедники."),
        City(id = 2, name = "Tokyo", country = "Japan", "https://bluebird.by/upload/iblock/288/2880f8c128511e7c9e80142ee36fbae7.jpg", "Токио — столица Японии, один из самых крупных и современных мегаполисов мира. Город известен своими высокими небоскрёбами, технологическими достижениями и уникальной смесью традиционной японской культуры и современного стиля жизни"),
        City(id = 3,
        name = "New York City",
        country = "United States",
         "https://mykaleidoscope.ru/x/uploads/posts/2022-09/1663463603_54-mykaleidoscope-ru-p-nyu-york-stolitsa-mira-dostoprimechatelnos-58.jpg",
        description = "Нью-Йорк — крупнейший город в Соединённых Штатах Америки, финансовый, культурный и туристический центр. Известен своими высотными небоскрёбами, Times Square и разнообразием культурных мероприятий."),
        City(
        id = 4,
        name = "Paris",
        country = "France",
        "https://i.artfile.ru/2560x1706_1506494_[www.ArtFile.ru].jpg",
         "Париж — столица Франции, один из важнейших культурных и исторических центров мира. Известен своими архитектурными памятниками, такими как Эйфелева башня и Лувр, а также своей кухней и модой."
        ),
        City(
        id = 5,
        name = "Sydney",
        country = "Australia",
        "https://sportishka.com/uploads/posts/2022-04/1650608518_64-sportishka-com-p-sidnei-dostoprimechatelnosti-krasivo-foto-70.jpg",
        "Сидней — крупнейший город Австралии, известный своими иконическими строениями, включая оперный театр и Harbour Bridge. Город является важным экономическим и культурным центром страны."
        ),
        City(
            id = 6,
            name = "Rio de Janeiro",
            country = "Brazil",
             "https://www.airpano.ru/photogallery/images_1550/71_707583_Rio-de-JaneiroBrazil.jpg",
            description = "Рио-де-Жанейро — крупнейший город Бразилии, известный своими пляжами, включая Ипанему и Копакабану, скачками, самбой и статуей Христа-Искупителя на вершине холма Корковаду."
        )
    )
}