package dev.Zerphyis.MicroRabbitEmail.Domain.model;



public record Email(  String fromAddress,
                      String toAddress,
                      String subject,
                      String body) {
}
