package com.servletStore.settings.standard.model;

import java.util.List;

import com.servletStore.settings.school.model.SchoolPOJO;
import com.servletStore.settings.section.model.SectionPojo;

public interface StandardDAO {
	
	public int addStandard(StandardPOJO standardPojo);
	public List<StandardPOJO> getStandardDetails();
	public List<StandardPOJO> getClassDetails();
	List<SchoolPOJO> getSchoolDetails(); 
	public int addClass(StandardPOJO standardPojo, String schoolID, String sectionId);
	
}
