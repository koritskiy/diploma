package com.koritski.teamsync.auth.dto.rq;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RqUploadGitHubToken {
    private String token;
}
