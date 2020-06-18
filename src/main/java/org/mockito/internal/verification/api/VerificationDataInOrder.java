/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.verification.api;

import java.util.List;

import org.mockito.invocation.Invocation;
import org.mockito.invocation.MatchableInvocation;

public interface VerificationDataInOrder {

    List<Invocation> getAllInvocations();

    MatchableInvocation getWanted();

    InOrderContext getOrderingContext();
}
