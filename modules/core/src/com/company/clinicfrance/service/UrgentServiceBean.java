package com.company.clinicfrance.service;

import com.company.clinic.entity.Visit;
import com.company.clinic.service.VisitServiceBean;
import com.company.clinicfrance.entity.UrgentVisit;
import org.apache.commons.lang3.BooleanUtils;

import java.math.BigDecimal;

public class UrgentServiceBean extends VisitServiceBean {

    @Override
    public BigDecimal calculateAmount(Visit visit) {
        BigDecimal amount = super.calculateAmount(visit);
        if (BooleanUtils.isTrue(((UrgentVisit)visit).getUrgent())) {
            amount = amount.add(new BigDecimal(50));
        } else {
            amount = amount.add(BigDecimal.TEN);
        }
        return amount;
    }
}
