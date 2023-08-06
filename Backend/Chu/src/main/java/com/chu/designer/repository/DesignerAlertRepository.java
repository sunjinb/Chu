package com.chu.designer.repository;

import com.chu.designer.domain.DesignerAlert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface DesignerAlertRepository extends JpaRepository<DesignerAlert, Integer>{

    //ArrayList<DesignerAlert> getAlertToDesigner(int designerSeq);
    List<DesignerAlert> getDesignerAlertBySeq(int designerSeq);
}
