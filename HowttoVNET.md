# Deploying a Virtual Network (VNet) in Azure

## Prerequisites
- Azure subscription
- Azure CLI installed

## Steps

1. Open a terminal or command prompt.

2. Sign in to your Azure account using the Azure CLI:
    ```bash
    az login
    ```

3. Set the desired Azure subscription:
    ```bash
    az account set --subscription <subscription_id>
    ```

4. Create a resource group to contain the VNet:
    ```bash
    az group create --name <resource_group_name> --location <location>
    ```

5. Create the VNet:
    ```bash
    az network vnet create --name <vnet_name> --resource-group <resource_group_name> --location <location> --address-prefixes <address_prefix>
    ```

6. (Optional) Create subnets within the VNet:
    ```bash
    az network vnet subnet create --name <subnet_name> --vnet-name <vnet_name> --resource-group <resource_group_name> --address-prefixes <subnet_address_prefix>
    ```

7. (Optional) Configure network security groups (NSGs) and rules:
    ```bash
    az network nsg create --name <nsg_name> --resource-group <resource_group_name> --location <location>
    az network nsg rule create --name <rule_name> --nsg-name <nsg_name> --resource-group <resource_group_name> --priority <priority> --source-address-prefixes <source_address_prefix> --destination-address-prefixes <destination_address_prefix> --destination-port-ranges <destination_port_range> --access <access> --protocol <protocol>
    ```

8. (Optional) Configure network peering between VNets:
    ```bash
    az network vnet peering create --name <peering_name> --resource-group <resource_group_name> --vnet-name <vnet_name> --remote-vnet <remote_vnet_id> --allow-vnet-access
    ```

9. (Optional) Configure VPN gateway for site-to-site connectivity:
    ```bash
    az network vnet-gateway create --name <gateway_name> --resource-group <resource_group_name> --vnet <vnet_name> --public-ip-address <public_ip_address> --gateway-type Vpn --vpn-type RouteBased --sku VpnGw1 --no-wait
    ```

10. Verify the VNet deployment:
     ```bash
     az network vnet show --name <vnet_name> --resource-group <resource_group_name> --output table
     ```

11. Clean up (if needed):
     ```bash
     az group delete --name <resource_group_name> --yes --no-wait
     ```

## Conclusion
In this guide, you learned how to deploy a Virtual Network (VNet) in Azure using the Azure CLI. You can now proceed to configure additional resources within the VNet or use it for your applications and services.