SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema sistemavenda
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema sistemavenda
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sistemavenda` DEFAULT CHARACTER SET utf8mb4 ;
USE `sistemavenda` ;

-- -----------------------------------------------------
-- Table `sistemavenda`.`vendedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemavenda`.`vendedor` (
  `nro_vend` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome_vend` VARCHAR(50) NOT NULL,
  `nro_cliente` TINYINT UNSIGNED NULL,
  PRIMARY KEY (`nro_vend`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `sistemavenda`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemavenda`.`cliente` (
  `nro_cliente` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `nome_cliente` VARCHAR(50) NOT NULL,
  `endereco` VARCHAR(80) NULL,
  `complemento` VARCHAR(80) NULL,
  PRIMARY KEY (`nro_cliente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `sistemavenda`.`venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sistemavenda`.`venda` (
  `vendedor_nro_vend` INT UNSIGNED NOT NULL,
  `cliente_nro_cliente` INT UNSIGNED NOT NULL,
  `nro_vend` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `data_venda` DATETIME NOT NULL,
  INDEX `fk_vendedor_has_cliente_cliente1_idx` (`cliente_nro_cliente` ASC),
  INDEX `fk_vendedor_has_cliente_vendedor_idx` (`vendedor_nro_vend` ASC),
  PRIMARY KEY (`nro_vend`),
  CONSTRAINT `fk_vendedor_has_cliente_vendedor`
    FOREIGN KEY (`vendedor_nro_vend`)
    REFERENCES `sistemavenda`.`vendedor` (`nro_vend`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_vendedor_has_cliente_cliente1`
    FOREIGN KEY (`cliente_nro_cliente`)
    REFERENCES `sistemavenda`.`cliente` (`nro_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
