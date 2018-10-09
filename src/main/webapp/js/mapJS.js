
// Funcion para crear el mapa y ubicar la posicion actual

function initMap() {

    var map = new google.maps.Map(document.getElementById('mapa'), {
        zoom: 8,
        center: {
            lat: -34.397,
            lng: 150.644
        }
    });

    var infoWindow = new google.maps.InfoWindow({
        map: map
    });

    navigator.geolocation.getCurrentPosition(function (position) {
        var pos = {
            lat: position.coords.latitude,
            lng: position.coords.longitude
        };
        infoWindow.setPosition(pos);
        infoWindow.setContent('Tu Ubicación');
        map.setCenter(pos);

    });


    setMarkers(map);

}

// punto: nombre,latitud, longitud

var puntos = [
    ['Bondi Beach', -33.890542, 151.274856, '../img/moti.png'],
    ['Coogee Beach', -33.923036, 151.259052, '../img/moti.png'],
    ['Cronulla Beach', -34.028249, 151.157507, '../img/moti.png'],
    ['Manly Beach', -33.80010128657071, 151.28747820854187,
        '../img/moti.png'],
    ['Maroubra Beach', -33.950198, 151.259302, '../img/moti.png']];



// Funcion para marcar los puntos
function setMarkers(map) {
    if ($("#mapa").length > 0) {
        $.getJSON("../controlador", {listar: "true"})
                .done(function (json) {
                    if (json.length > 0) {
                        var infowindow = new google.maps.InfoWindow();
                    for (var i = 0; i < puntos.length; i++) {
                        //console.log(json[i].api_cloud);

                        var marker = new google.maps.Marker({
                            position: {
                                lat: puntos[i][1],
                                lng: puntos[i][2]
                            },
                            map: map,
                            title: puntos[i][0]
                        });

                        google.maps.event.addListener(marker, 'click', (function (marker, i) {
                            return function () {
                                infowindow.setContent('<img src="' + puntos[i][3]
                                        + '" width="200px">');
                                infowindow.open(map, marker);
                            }
                        })(marker, i));
                    }
                    }
                });
    }
    

}
