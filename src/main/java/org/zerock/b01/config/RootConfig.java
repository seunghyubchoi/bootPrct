package org.zerock.b01.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

@Configuration
public class RootConfig {
    @Bean
    public ModelMapper getMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true) // modelMapper 가 필드 이름을 기준으로 매핑 시도하도록 설정
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE) // private 필드 접근 가능
                .setMatchingStrategy(MatchingStrategies.LOOSE); // 이름이 정확히 일치하지 않더라도 유사한 필드끼리 매핑

        return modelMapper;
    }
}
