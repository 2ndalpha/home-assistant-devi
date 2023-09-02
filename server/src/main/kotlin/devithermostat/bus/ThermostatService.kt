package devithermostat.bus

import io.github.sonic_amiga.opensdg.java.GridConnection

class ThermostatService {

    private val log = LoggerFactory.getLogger(javaClass)

    fun lego() {
        log.debug("Trying to connect to the grid")
        GridConnection(null)
    }
}