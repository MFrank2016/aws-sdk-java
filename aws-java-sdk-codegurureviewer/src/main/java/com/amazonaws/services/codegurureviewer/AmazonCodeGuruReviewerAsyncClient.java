/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codegurureviewer;

import javax.annotation.Generated;

import com.amazonaws.services.codegurureviewer.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing CodeGuruReviewer asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This section provides documentation for the Amazon CodeGuru Reviewer API operations.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonCodeGuruReviewerAsyncClient extends AmazonCodeGuruReviewerClient implements AmazonCodeGuruReviewerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonCodeGuruReviewerAsyncClientBuilder asyncBuilder() {
        return AmazonCodeGuruReviewerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on CodeGuruReviewer using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonCodeGuruReviewerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AssociateRepositoryResult> associateRepositoryAsync(AssociateRepositoryRequest request) {

        return associateRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateRepositoryResult> associateRepositoryAsync(final AssociateRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateRepositoryRequest, AssociateRepositoryResult> asyncHandler) {
        final AssociateRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateRepositoryResult>() {
            @Override
            public AssociateRepositoryResult call() throws Exception {
                AssociateRepositoryResult result = null;

                try {
                    result = executeAssociateRepository(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeCodeReviewResult> describeCodeReviewAsync(DescribeCodeReviewRequest request) {

        return describeCodeReviewAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCodeReviewResult> describeCodeReviewAsync(final DescribeCodeReviewRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeCodeReviewRequest, DescribeCodeReviewResult> asyncHandler) {
        final DescribeCodeReviewRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeCodeReviewResult>() {
            @Override
            public DescribeCodeReviewResult call() throws Exception {
                DescribeCodeReviewResult result = null;

                try {
                    result = executeDescribeCodeReview(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRecommendationFeedbackResult> describeRecommendationFeedbackAsync(DescribeRecommendationFeedbackRequest request) {

        return describeRecommendationFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRecommendationFeedbackResult> describeRecommendationFeedbackAsync(
            final DescribeRecommendationFeedbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRecommendationFeedbackRequest, DescribeRecommendationFeedbackResult> asyncHandler) {
        final DescribeRecommendationFeedbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRecommendationFeedbackResult>() {
            @Override
            public DescribeRecommendationFeedbackResult call() throws Exception {
                DescribeRecommendationFeedbackResult result = null;

                try {
                    result = executeDescribeRecommendationFeedback(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoryAssociationResult> describeRepositoryAssociationAsync(DescribeRepositoryAssociationRequest request) {

        return describeRepositoryAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRepositoryAssociationResult> describeRepositoryAssociationAsync(
            final DescribeRepositoryAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRepositoryAssociationRequest, DescribeRepositoryAssociationResult> asyncHandler) {
        final DescribeRepositoryAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRepositoryAssociationResult>() {
            @Override
            public DescribeRepositoryAssociationResult call() throws Exception {
                DescribeRepositoryAssociationResult result = null;

                try {
                    result = executeDescribeRepositoryAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateRepositoryResult> disassociateRepositoryAsync(DisassociateRepositoryRequest request) {

        return disassociateRepositoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateRepositoryResult> disassociateRepositoryAsync(final DisassociateRepositoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateRepositoryRequest, DisassociateRepositoryResult> asyncHandler) {
        final DisassociateRepositoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateRepositoryResult>() {
            @Override
            public DisassociateRepositoryResult call() throws Exception {
                DisassociateRepositoryResult result = null;

                try {
                    result = executeDisassociateRepository(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListCodeReviewsResult> listCodeReviewsAsync(ListCodeReviewsRequest request) {

        return listCodeReviewsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListCodeReviewsResult> listCodeReviewsAsync(final ListCodeReviewsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListCodeReviewsRequest, ListCodeReviewsResult> asyncHandler) {
        final ListCodeReviewsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListCodeReviewsResult>() {
            @Override
            public ListCodeReviewsResult call() throws Exception {
                ListCodeReviewsResult result = null;

                try {
                    result = executeListCodeReviews(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationFeedbackResult> listRecommendationFeedbackAsync(ListRecommendationFeedbackRequest request) {

        return listRecommendationFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationFeedbackResult> listRecommendationFeedbackAsync(final ListRecommendationFeedbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecommendationFeedbackRequest, ListRecommendationFeedbackResult> asyncHandler) {
        final ListRecommendationFeedbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecommendationFeedbackResult>() {
            @Override
            public ListRecommendationFeedbackResult call() throws Exception {
                ListRecommendationFeedbackResult result = null;

                try {
                    result = executeListRecommendationFeedback(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest request) {

        return listRecommendationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(final ListRecommendationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRecommendationsRequest, ListRecommendationsResult> asyncHandler) {
        final ListRecommendationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRecommendationsResult>() {
            @Override
            public ListRecommendationsResult call() throws Exception {
                ListRecommendationsResult result = null;

                try {
                    result = executeListRecommendations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListRepositoryAssociationsResult> listRepositoryAssociationsAsync(ListRepositoryAssociationsRequest request) {

        return listRepositoryAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoryAssociationsResult> listRepositoryAssociationsAsync(final ListRepositoryAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRepositoryAssociationsRequest, ListRepositoryAssociationsResult> asyncHandler) {
        final ListRepositoryAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRepositoryAssociationsResult>() {
            @Override
            public ListRepositoryAssociationsResult call() throws Exception {
                ListRepositoryAssociationsResult result = null;

                try {
                    result = executeListRepositoryAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutRecommendationFeedbackResult> putRecommendationFeedbackAsync(PutRecommendationFeedbackRequest request) {

        return putRecommendationFeedbackAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecommendationFeedbackResult> putRecommendationFeedbackAsync(final PutRecommendationFeedbackRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRecommendationFeedbackRequest, PutRecommendationFeedbackResult> asyncHandler) {
        final PutRecommendationFeedbackRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRecommendationFeedbackResult>() {
            @Override
            public PutRecommendationFeedbackResult call() throws Exception {
                PutRecommendationFeedbackResult result = null;

                try {
                    result = executePutRecommendationFeedback(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
