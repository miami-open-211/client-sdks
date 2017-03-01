# SwaggerClient::Service

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Each service must have a unique identifier. | [optional] 
**organization_id** | **String** | The identifier of the organization that provides this service. | [optional] 
**location_id** | **String** | The identifier of the location where this service is delivered. | [optional] 
**program_id** | **String** | The identifier of the program this service is delivered under. | [optional] 
**name** | **String** | The official or public name of the service. | [optional] 
**alternate_name** | **String** | Alternative or commonly used name for a service. | [optional] 
**description** | **String** | A description of the service. | [optional] 
**url** | **String** | URL of the service | [optional] 
**email** | **String** | Email address for the service | [optional] 
**status** | **String** | The current status of the service. | [optional] 
**application_process** | **String** | The steps needed to access the service. | [optional] 
**wait_time** | **String** | Time a client may expect to wait before receiving a service. | [optional] 
**taxonomy_ids** | **String** | A comma separated list of identifiers from the taxonomy table. Advanced users may also include composite categories, using * to combine two taxonomy terms. | [optional] 


