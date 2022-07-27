package cj.life.middle.apc.service;

import cj.life.middle.apc.domain.FactApp;
import cj.life.middle.apc.domain.FactImgs;
import cj.life.middle.apc.domain.FactVersions;

import java.math.BigDecimal;
import java.util.List;

public interface IFactAppService {
    void releaseFactApp(
            String appId,
            String appSlogan,
            String appVersion,
            String dimCateId,
            String dimTerminalId,
            String dimCountryId,
            String dimChargeMode,
            BigDecimal emplUnitPrice,
            BigDecimal tenantUnitPrice,
            String note
    );

    void removeFactApp(String appId);

    FactApp getFactApp(String appId);

    List<FactApp> listFactApp(int limit, long offset);

    List<FactApp> listFactAppWithDim(String dimCateId,
                                     String dimTerminalId,
                                     String dimCountryId,
                                     String dimChargeMode,
                                     int limit,
                                     long offset
    );

    void upToPortlet(String appId, String portletId,int orderNum);

    void downFromPortlet(String appId, String portletId);

    List<FactApp> listFactAppWithPortlet(String portletId, int limit, long offset);

    void addImage(String appId, String imgSrc, String imgNote);

    void removeImage(String imgId);

    List<FactImgs> listImage(String appId);

    List<FactVersions> listVersion(String appId, int limit, long offset);
}
