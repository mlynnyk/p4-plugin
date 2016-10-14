package org.jenkinsci.plugins.p4.review;

import hudson.Extension;
import hudson.model.Action;
import hudson.model.Job;
import jenkins.model.TransientActionFactory;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.Collections;

@Extension
public class ReviewActionFactory extends TransientActionFactory<Job> {

	@Override
	public Class<Job> type() {
		return Job.class;
	}

	@Nonnull
	@Override
	public Collection<? extends Action> createFor(@Nonnull Job target) {
		return Collections.singletonList(new ReviewAction(target));
	}
}