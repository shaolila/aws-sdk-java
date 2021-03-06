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
package com.amazonaws.services.s3control;

import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;

/**
 * Abstract implementation of {@code AWSS3ControlAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSS3ControlAsync extends AbstractAWSS3Control implements AWSS3ControlAsync {

    protected AbstractAWSS3ControlAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(CreateAccessPointRequest request) {

        return createAccessPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccessPointResult> createAccessPointAsync(CreateAccessPointRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAccessPointRequest, CreateAccessPointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateBucketResult> createBucketAsync(CreateBucketRequest request) {

        return createBucketAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBucketResult> createBucketAsync(CreateBucketRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateBucketRequest, CreateBucketResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest request) {

        return createJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(CreateJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(DeleteAccessPointRequest request) {

        return deleteAccessPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPointResult> deleteAccessPointAsync(DeleteAccessPointRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessPointRequest, DeleteAccessPointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPointPolicyResult> deleteAccessPointPolicyAsync(DeleteAccessPointPolicyRequest request) {

        return deleteAccessPointPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAccessPointPolicyResult> deleteAccessPointPolicyAsync(DeleteAccessPointPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessPointPolicyRequest, DeleteAccessPointPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketResult> deleteBucketAsync(DeleteBucketRequest request) {

        return deleteBucketAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketResult> deleteBucketAsync(DeleteBucketRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBucketRequest, DeleteBucketResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketLifecycleConfigurationResult> deleteBucketLifecycleConfigurationAsync(
            DeleteBucketLifecycleConfigurationRequest request) {

        return deleteBucketLifecycleConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketLifecycleConfigurationResult> deleteBucketLifecycleConfigurationAsync(
            DeleteBucketLifecycleConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBucketLifecycleConfigurationRequest, DeleteBucketLifecycleConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketPolicyResult> deleteBucketPolicyAsync(DeleteBucketPolicyRequest request) {

        return deleteBucketPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketPolicyResult> deleteBucketPolicyAsync(DeleteBucketPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBucketPolicyRequest, DeleteBucketPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketTaggingResult> deleteBucketTaggingAsync(DeleteBucketTaggingRequest request) {

        return deleteBucketTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBucketTaggingResult> deleteBucketTaggingAsync(DeleteBucketTaggingRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteBucketTaggingRequest, DeleteBucketTaggingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteJobTaggingResult> deleteJobTaggingAsync(DeleteJobTaggingRequest request) {

        return deleteJobTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteJobTaggingResult> deleteJobTaggingAsync(DeleteJobTaggingRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteJobTaggingRequest, DeleteJobTaggingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePublicAccessBlockResult> deletePublicAccessBlockAsync(DeletePublicAccessBlockRequest request) {

        return deletePublicAccessBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePublicAccessBlockResult> deletePublicAccessBlockAsync(DeletePublicAccessBlockRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePublicAccessBlockRequest, DeletePublicAccessBlockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest request) {

        return describeJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeJobRequest, DescribeJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccessPointResult> getAccessPointAsync(GetAccessPointRequest request) {

        return getAccessPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccessPointResult> getAccessPointAsync(GetAccessPointRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccessPointRequest, GetAccessPointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccessPointPolicyResult> getAccessPointPolicyAsync(GetAccessPointPolicyRequest request) {

        return getAccessPointPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccessPointPolicyResult> getAccessPointPolicyAsync(GetAccessPointPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccessPointPolicyRequest, GetAccessPointPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccessPointPolicyStatusResult> getAccessPointPolicyStatusAsync(GetAccessPointPolicyStatusRequest request) {

        return getAccessPointPolicyStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccessPointPolicyStatusResult> getAccessPointPolicyStatusAsync(GetAccessPointPolicyStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccessPointPolicyStatusRequest, GetAccessPointPolicyStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBucketResult> getBucketAsync(GetBucketRequest request) {

        return getBucketAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBucketResult> getBucketAsync(GetBucketRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBucketRequest, GetBucketResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBucketLifecycleConfigurationResult> getBucketLifecycleConfigurationAsync(
            GetBucketLifecycleConfigurationRequest request) {

        return getBucketLifecycleConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBucketLifecycleConfigurationResult> getBucketLifecycleConfigurationAsync(
            GetBucketLifecycleConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBucketLifecycleConfigurationRequest, GetBucketLifecycleConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBucketPolicyResult> getBucketPolicyAsync(GetBucketPolicyRequest request) {

        return getBucketPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBucketPolicyResult> getBucketPolicyAsync(GetBucketPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBucketPolicyRequest, GetBucketPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetBucketTaggingResult> getBucketTaggingAsync(GetBucketTaggingRequest request) {

        return getBucketTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetBucketTaggingResult> getBucketTaggingAsync(GetBucketTaggingRequest request,
            com.amazonaws.handlers.AsyncHandler<GetBucketTaggingRequest, GetBucketTaggingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetJobTaggingResult> getJobTaggingAsync(GetJobTaggingRequest request) {

        return getJobTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobTaggingResult> getJobTaggingAsync(GetJobTaggingRequest request,
            com.amazonaws.handlers.AsyncHandler<GetJobTaggingRequest, GetJobTaggingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPublicAccessBlockResult> getPublicAccessBlockAsync(GetPublicAccessBlockRequest request) {

        return getPublicAccessBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPublicAccessBlockResult> getPublicAccessBlockAsync(GetPublicAccessBlockRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPublicAccessBlockRequest, GetPublicAccessBlockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAccessPointsResult> listAccessPointsAsync(ListAccessPointsRequest request) {

        return listAccessPointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccessPointsResult> listAccessPointsAsync(ListAccessPointsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAccessPointsRequest, ListAccessPointsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRegionalBucketsResult> listRegionalBucketsAsync(ListRegionalBucketsRequest request) {

        return listRegionalBucketsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRegionalBucketsResult> listRegionalBucketsAsync(ListRegionalBucketsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRegionalBucketsRequest, ListRegionalBucketsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutAccessPointPolicyResult> putAccessPointPolicyAsync(PutAccessPointPolicyRequest request) {

        return putAccessPointPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutAccessPointPolicyResult> putAccessPointPolicyAsync(PutAccessPointPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutAccessPointPolicyRequest, PutAccessPointPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutBucketLifecycleConfigurationResult> putBucketLifecycleConfigurationAsync(
            PutBucketLifecycleConfigurationRequest request) {

        return putBucketLifecycleConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBucketLifecycleConfigurationResult> putBucketLifecycleConfigurationAsync(
            PutBucketLifecycleConfigurationRequest request,
            com.amazonaws.handlers.AsyncHandler<PutBucketLifecycleConfigurationRequest, PutBucketLifecycleConfigurationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutBucketPolicyResult> putBucketPolicyAsync(PutBucketPolicyRequest request) {

        return putBucketPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBucketPolicyResult> putBucketPolicyAsync(PutBucketPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutBucketPolicyRequest, PutBucketPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutBucketTaggingResult> putBucketTaggingAsync(PutBucketTaggingRequest request) {

        return putBucketTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutBucketTaggingResult> putBucketTaggingAsync(PutBucketTaggingRequest request,
            com.amazonaws.handlers.AsyncHandler<PutBucketTaggingRequest, PutBucketTaggingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutJobTaggingResult> putJobTaggingAsync(PutJobTaggingRequest request) {

        return putJobTaggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutJobTaggingResult> putJobTaggingAsync(PutJobTaggingRequest request,
            com.amazonaws.handlers.AsyncHandler<PutJobTaggingRequest, PutJobTaggingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutPublicAccessBlockResult> putPublicAccessBlockAsync(PutPublicAccessBlockRequest request) {

        return putPublicAccessBlockAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPublicAccessBlockResult> putPublicAccessBlockAsync(PutPublicAccessBlockRequest request,
            com.amazonaws.handlers.AsyncHandler<PutPublicAccessBlockRequest, PutPublicAccessBlockResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateJobPriorityResult> updateJobPriorityAsync(UpdateJobPriorityRequest request) {

        return updateJobPriorityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobPriorityResult> updateJobPriorityAsync(UpdateJobPriorityRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateJobPriorityRequest, UpdateJobPriorityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateJobStatusResult> updateJobStatusAsync(UpdateJobStatusRequest request) {

        return updateJobStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobStatusResult> updateJobStatusAsync(UpdateJobStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateJobStatusRequest, UpdateJobStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
