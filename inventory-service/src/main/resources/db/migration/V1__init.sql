CREATE TABLE `t_inventory` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `sku_code` VARCHAR(255) DEFAULT NULL,
    `quantity` INT(11) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO t_inventory (quantity, sku_code)
VALUES (100, 'iphone_15'),
    (100, 'Pixel_8'),
    (100, 'Galaxy_24'),
    (100, 'OnePlus_12');
