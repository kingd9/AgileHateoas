package net.daneking.agile.home;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

@Component
public class HomeResourceAssembler extends ResourceAssemblerSupport<Home, HomeResource> {

	public HomeResourceAssembler() {
		super(HomeResource.class, HomeResource.class);
	}

	@Override
	public HomeResource toResource(final Home home) {
		return new HomeResource();
	}

}
