package com.jontxu.HockeyLeague.data;

import java.util.List;

public record Coach(
        Accreditation accreditation,
        int expYears,
        List<Team> teams
) {
}
